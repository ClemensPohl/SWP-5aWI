package at.cp.games.firstgame;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends BasicGame {
    public MainGame(String title) {
        super(title);
    }

    private int x,y;
    private List<Actor> actors;
    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for(Actor actor : this.actors){
            actor.render(graphics);
        }
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        this.actors.add(new RectActor(100,250, RectActor.direction.right));
        this.actors.add(new OvalActor(100,20, OvalActor.direction.down));
        this.actors.add(new CircleActor(10,20, CircleActor.direction.left));
        this.actors.add(new IdleBar(0,50));
        this.actors.add(new IdleBar(0,700));

    }

    @Override
    public void update(GameContainer gc, int delta) throws SlickException {
        for(Actor actor : this.actors){
            actor.update(gc, delta);
        }

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new MainGame("MainGame"));
            container.setDisplayMode(1400,800,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }


}
