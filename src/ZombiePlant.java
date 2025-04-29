public class ZombiePlant {
    private int potency;
    private int treatments;

    public ZombiePlant(int potency1, int treatments1) {
        potency = potency1;
        treatments = treatments1;
    }
    public int getPotency() {
        return potency;
    }
    public int treatmentsNeeded() {
        return treatments;
    }
    public boolean isDangerous() {
        return (treatments>0);
    }
    public void treat(int treat) {
        if (treatments>0 && treat>0 && treat<=potency) {
            treatments--;
        }
        else if (treat>potency){
            treatments++;
        }
    }
}