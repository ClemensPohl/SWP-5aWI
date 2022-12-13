package at.cp.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class IdleBar implements Actor{

    public int x,y;

    public IdleBar(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.x++;
        if(this.x == 1400){
            this.x = -50;
        }
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawString("Simon isch a anti gigabrain", this.x, this.y);
    }
}
