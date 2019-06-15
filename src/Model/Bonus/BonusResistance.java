
package Model.Bonus;

Public class BonusResistance extends Bonus{
    public void get_bonus(Personage p){
        if(p.check_is_here(this.x, this.y)){
            p.gain_resistance(1);
        }
    }
}