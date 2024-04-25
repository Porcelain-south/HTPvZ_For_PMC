package com.hungteen.pvz.common.item;

import com.hungteen.pvz.common.item.PVZItemGroups;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ForProjectE extends Item {

    public ForProjectE() {
        super(new Item.Properties().tab(PVZItemGroups.PVZ_USEFUL).stacksTo(1));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> textComponents, ITooltipFlag tooltipFlag) {
        super.appendHoverText(stack, world, textComponents, tooltipFlag);
    }
}
