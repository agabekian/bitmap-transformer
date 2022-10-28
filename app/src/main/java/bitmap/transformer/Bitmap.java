package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {

    BufferedImage pixelData;

    public Bitmap(String fileName) throws IOException {
        File f = new File(fileName);
        this.pixelData = ImageIO.read(f);
    }
    public void write(String fileNameToWriteTo) throws IOException {
        File f = new File(fileNameToWriteTo);
        ImageIO.write(this.pixelData, "bmp", f);
    }

    public void convertToGreyScale() {
        for (int i=0; i < this.pixelData.getWidth(); i++){
            for( int j=0; j < this.pixelData.getHeight(); j++){
                Color color = new Color(this.pixelData.getRGB(i, j));
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                int grey = (r + g + b) / 3;

                Color grayColor = new Color (grey, grey, grey);
                this.pixelData.setRGB(i, j, grayColor.getRGB());
            }
        }
    }

    public void convertToNegative() {
        for (int i = 0; i < this.pixelData.getWidth(); i++){
            for( int j=0; j < this.pixelData.getHeight(); j++){
                Color color = new Color(this.pixelData.getRGB(i, j), true);
                color = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
                this.pixelData.setRGB(i, j, color.getRGB());
            }
        }
    }
    public void convertWhiteToRed() {
        for (int i=0; i < this.pixelData.getWidth(); i++){
            for( int j=0; j < this.pixelData.getHeight(); j++){
                Color color = new Color(this.pixelData.getRGB(i, j));
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                int a = color.getAlpha();
                if(r > 200 && g > 200 && b > 200) {
                    Color red = new Color(255, 0, 0, a);
                    this.pixelData.setRGB(i, j, red.getRGB());
                }
            }
        }
    }
}

// main ref for how to start https://github.com/SharinaS/bitmap-transformer