public class ZombieClass{
    private int maximumPotency;
    private int successfultreatmentsNeeded;
    public ZombiePlant(int maximumPotency, int successfultreatmentsNeeded){
        this.maximumPotency = maximumPotency;
        this.successfultreatmentsNeeded = successfultreatmentsNeeded;
    }
    public int getPotency(){
        return maximumPotency;
    }
    public int treatmentsNeeded(){
        return successfultreatmentsNeeded;
    }
    public boolean isDangerous(){
        return successfultreatmentsNeeded == 0;
    }
    public void treat(int potency){
        if (potency > 0){
            if (potency <= this.maximumPotency && this.successfultreatmentsNeeded > 0){
                this.successfultreatmentsNeeded--;
            }
            else if (potency > this.maximumPotency){
                this.successfultreatmentsNeeded++;
            }
        }
    }

}