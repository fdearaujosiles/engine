package engine.sprite;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Sprite {

    protected BufferedImage img;
    private int tileWidth, tileHeight, tilesPerRow, tilesPerCol;

    public Sprite(String resource) {
        readImage(resource, 1, 1);
    }

    public Sprite(String resource, int tilesPerRow, int tilesPerCol) {
        readImage(resource, tilesPerRow, tilesPerCol);
    }

    public BufferedImage getFrame(int i) {
        int col = i % tilesPerRow;
        int row = i / tilesPerRow;
        int x = col * tileWidth;
        int y = row * tileHeight;
        return img.getSubimage(x, y, tileWidth, tileHeight);
    }

    public BufferedImage[] getFrames(int start, int end) {
        BufferedImage[] frames = new BufferedImage[end - start];
        for(int i=0; i < end - start; i++) {
            frames[i] = getFrame(start + i);
        }
        return frames;
    }

    public BufferedImage[] getAllFrames() {
        return getFrames(0, tilesPerRow * tilesPerCol);
    }

    public int getWidth() {
        return img.getWidth();
    }
    public int getHeight() {
        return img.getHeight();
    }
    public int getTileWidth() {
        return tileWidth;
    }
    public int getTileHeight() {
        return tileHeight;
    }

    private void readImage(String resource, int tilesPerRow, int tilesPerCol) {
        InputStream is = getClass().getResourceAsStream(resource);
        try {
            this.img = ImageIO.read(is);
            this.tileWidth = img.getWidth() / tilesPerRow;
            this.tileHeight =  img.getHeight() / tilesPerCol;
            this.tilesPerRow = tilesPerRow;
            this.tilesPerCol = tilesPerCol;
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
