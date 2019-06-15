
package Model.Bonus;

Public class BonusVitesse extends Bonus{
    public void get_bonus(Personage p){
        if(p.check_is_here(this.x, this.y)){
            p.gain_vitesse(5);
        }
    }
}