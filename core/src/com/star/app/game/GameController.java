package com.star.app.game;

public class GameController {
    private Background background;
    private Hero hero;


    public Hero getHero() {
        return hero;
    }

    public Background getBackground() {
        return background;
    }

    public GameController() {
        this.background = new Background(this);
        this.hero = new Hero();
    }

    public void update(float dt) {
        background.update(dt);
        hero.update(dt);

    }
}
