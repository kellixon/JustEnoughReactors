package dev.aura.justenoughreactors.jei.fuel;

import dev.aura.justenoughreactors.util.OreDictHelper;
import javax.annotation.Nonnull;
import lombok.NonNull;
import lombok.Value;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.item.ItemStack;

@Value
public class FuelWrapper implements IRecipeWrapper {
  @NonNull private final FuelEntry fuelEntry;

  @Override
  public void getIngredients(@Nonnull IIngredients ingredients) {
    ingredients.setInput(ItemStack.class, OreDictHelper.oreDictToItemStacks(fuelEntry.getFuel()));
    ingredients.setOutput(ItemStack.class, OreDictHelper.oreDictToItemStacks(fuelEntry.getWaste()));
  }
}
