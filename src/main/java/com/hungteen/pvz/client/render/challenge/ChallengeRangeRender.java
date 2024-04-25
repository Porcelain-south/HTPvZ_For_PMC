package com.hungteen.pvz.client.render.challenge;


import com.hungteen.pvz.PVZMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = PVZMod.MOD_ID)
public class ChallengeRangeRender {

    public static BlockPos showRangeCenter;
    public static int showRangeRadius;
    public static long remainTicks;


    private static int findRangeY(ClientWorld world, double x, double z) {
        int x0 = (int) Math.round(x);
        int z0 = (int) Math.round(z);


        return world.getHeight(Heightmap.Type.MOTION_BLOCKING, x0, z0);
    }


    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent ev) {
        if (ev.phase != TickEvent.Phase.START) {
            return;
        }

        if (showRangeCenter == null) {
            return;
        }

        if (remainTicks <= 0) {
            showRangeCenter = null;
            return;
        }
        remainTicks--;
        ClientWorld world = Minecraft.getInstance().level;
        if (world == null) {
            return;
        }

        double x0 = showRangeCenter.getX() + 0.5;
        double z0 = showRangeCenter.getZ() + 0.5;
        for (int i = 0; i < 360; i++) {
            if(world.random.nextInt(3) == 0) {
                continue;
            }
            double rad = (double) i / 180.0 * Math.PI;

            double x = x0 + Math.cos(rad) * showRangeRadius;
            double z = z0 + Math.sin(rad) * showRangeRadius;
            int y = findRangeY(world, x, z);

            world.addParticle(ParticleTypes.EFFECT, true, x, y, z, 0, 0, 0);
        }

    }

}
