package com.mygdx.game;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends Game {
public SpriteBatch batch;
	@Override
	public void create () {
		batch = new SpriteBatch();
             this.setScreen(new MainScren(this));
	}
        @Override
        public void render(){
            super.render();
        }
}
