
//import a faire

Public class BonusVie extends Bonus{
    public void get_bonus(double x, double y, Personage p){
        if(p.check_is_here(x, y)){
            p.gain_pv(5);
        }
    }
}