package inf.informatics.Players;

import inf.informatics.Trappers.Trap;

public abstract class Player {
    int position;
    Trap trap;
    public Player(){
        this.position=0;
    }
    public Trap getTrap(){
        return trap;
    }
    public void setTrap(Trap trapObj){
        trap = trapObj;
    }
    public int getPosition(){
        return position;
    }
    public void setPosition(int position){
        if(position >=0 && position <20){
            this.position=position;
        }
    }

}
