
package Model.Bonus;

Public class BonusRange extends Bonus{
    public void get_bonus(Personage p){
        if(p.check_is_here(this.x, this.y)){
            p.gain_range(0.5);
        }
    }
}