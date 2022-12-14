package at.cp.games.firstgame;

import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CircleActor implements Actor{
    private double x,y;
    private direction dirs;
    public enum direction{
        right,
        left,
        up,
        down
    }

    public CircleActor(double x, double y, direction dirs) {
        super();
        this.x = x;
        this.y = y;
        this.dirs = dirs;
    }

    public void update(GameContainer gc, int delta){
        if(this.dirs == direction.right){
            this.x++;
        } else if (this.dirs == direction.left) {
            this.x--;
        } else if (this.dirs == direction.up) {
            this.y--;
        } else if (this.dirs == direction.down) {
            this.y++;
        }
    }

    public void render(Graphics graphics){
        graphics.drawOval((float) this.x,(float) this.y, 20,20);
    }
}
