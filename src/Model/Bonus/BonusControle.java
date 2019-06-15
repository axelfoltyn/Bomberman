
package Model.Bonus;

Public class BonusControle extends Bonus{
    public void get_bonus(Personage p){
        if(p.check_is_here(this.x, this.y)){
            p.gain_controle(5);
        }
    }
}