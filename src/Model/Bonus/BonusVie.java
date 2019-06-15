
package Model.Bonus;

Public class BonusVie extends Bonus{
    public void get_bonus(Personage p){
        if(p.check_is_here(this.x, this.y)){
            p.gain_pv(5);
        }
    }
}