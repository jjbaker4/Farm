package main.java;

public class StateDiseased implements AssetState {

    public StateDiseased() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public boolean isDiseased() {
        // TODO Auto-generated method stub
        return true;
    }
    
}
