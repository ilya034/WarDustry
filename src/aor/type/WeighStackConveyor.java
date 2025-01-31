package aor.type;

import aor.aorItems;
import arc.math.Mathf;
import mindustry.type.ItemStack;
import mindustry.world.blocks.distribution.StackConveyor;
import mindustry.world.meta.StatUnit;

import static aor.aorMod.*;

public class WeighStackConveyor extends StackConveyor {
    public ItemStack[] items = aorItems.gematiteItem.researchRequirements();


    public WeighStackConveyor(String name) {
        super(name);
    }
    public void setStats() {
        super.setStats();
        this.stats.add(itemsMoved1, aorItems.gematiteItem);this.stats.add(itemsMoved1, aorItems.ironIngot);this.stats.add(itemsMoved1, aorItems.ironPlate);this.stats.add(itemsMoved1, aorItems.ironRod);this.stats.add(itemsMoved1, (float)Mathf.round(this.itemCapacity*0.3f*60f), StatUnit.itemsSecond);
        this.stats.add(itemsMoved2, aorItems.malachiteItem);this.stats.add(itemsMoved2, aorItems.copperIngot);this.stats.add(itemsMoved2, aorItems.copperPlate);this.stats.add(itemsMoved2, aorItems.copperWire);this.stats.add(itemsMoved2, (float)Mathf.round(this.itemCapacity*0.3f*60f), StatUnit.itemsSecond);
        this.stats.add(itemsMoved3, aorItems.leadItem);this.stats.add(itemsMoved3, aorItems.leadIngot);this.stats.add(itemsMoved3, aorItems.leadPlate);this.stats.add(itemsMoved3, (float)Mathf.round(this.itemCapacity*0.3f*60f), StatUnit.itemsSecond);
        this.stats.add(itemsMoved4, aorItems.aluminiumItem);this.stats.add(itemsMoved4, aorItems.aluminiumIngot);this.stats.add(itemsMoved4, aorItems.aluminiumPlate);this.stats.add(itemsMoved4, (float)Mathf.round(this.itemCapacity*0.3f*60f), StatUnit.itemsSecond);
        this.stats.add(itemsMoved5, aorItems.sphaleriteItem);this.stats.add(itemsMoved5, aorItems.zincIngot);this.stats.add(itemsMoved5, aorItems.zincPlate);this.stats.add(itemsMoved5, (float)Mathf.round(this.itemCapacity*0.25f*60f), StatUnit.itemsSecond);
        this.stats.add(itemsMoved9, aorItems.bitumen);this.stats.add(itemsMoved9, aorItems.petcoke);this.stats.add(itemsMoved9, aorItems.carbonElectrode);this.stats.add(itemsMoved9, aorItems.electricMotor);this.stats.add(itemsMoved9, (float)Mathf.round(this.itemCapacity*0.25f*60f), StatUnit.itemsSecond);
        this.stats.add(itemsMoved6, aorItems.steelItem);this.stats.add(itemsMoved6, aorItems.steelPlate);this.stats.add(itemsMoved6, aorItems.steelRod);this.stats.add(itemsMoved6, (float)Mathf.round(this.itemCapacity*0.20f*60f), StatUnit.itemsSecond);
        this.stats.add(itemsMoved7, aorItems.titaniumItem);this.stats.add(itemsMoved7, aorItems.titaniumIngot);this.stats.add(itemsMoved7, aorItems.titaniumPlate);this.stats.add(itemsMoved7, (float)Mathf.round(this.itemCapacity*0.15f*60f), StatUnit.itemsSecond);
        this.stats.add(itemsMoved8, aorItems.wolframiteItem);this.stats.add(itemsMoved8, aorItems.wolframiteIngot);this.stats.add(itemsMoved8, aorItems.wolframiteRod);this.stats.add(itemsMoved8, (float)Mathf.round(this.itemCapacity*0.15f*60f), StatUnit.itemsSecond);
        this.stats.add(itemsMoved10, aorItems.uranium);this.stats.add(itemsMoved10, aorItems.uranium238);this.stats.add(itemsMoved10, aorItems.uranium235);this.stats.add(itemsMoved10, aorItems.nuclearFuel);this.stats.add(itemsMoved10, (float)Mathf.round(this.itemCapacity * 0.10f * 60f), StatUnit.itemsSecond);
    }
    public class WeighStackConveyorBuild extends StackConveyor.StackConveyorBuild{
        @Override
        public void updateTile(){
            if(lastItem != null) {
                if (lastItem.hardness == 1) {speed = 0.3f;}
                if (lastItem.hardness == 2) {speed = 0.25f;}
                if (lastItem.hardness == 3) {speed = 0.20f;}
                if (lastItem.hardness == 4) {speed = 0.15f;}
                if (lastItem.hardness == 5) {speed = 0.10f;}
            } else{speed = 1f;}

            super.updateTile();
        }
    }
}