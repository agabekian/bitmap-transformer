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

    public void convertToGrayScale() {
        for (int i=0; i < this.pixelData.getWidth(); i++){
            for( int j=0; j < this.pixelData.getHeight(); j++){
                Color color = new Color(this.pixelData.getRGB(i, j));
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                int gray = (r + g + b) / 3;

                Color grayColor = new Color (gray, gray, gray);
                this.pixelData.setRGB(i, j, grayColor.getRGB());
            }
        }
    }

    // http://www.java2s.com/Tutorials/Java/Graphics_How_to/Image/Convert_negative_image_to_positive.htm
    public void convertToNegative() {
        for (int i = 0; i < this.pixelData.getWidth(); i++){
            for( int j=0; j < this.pixelData.getHeight(); j++){
                Color color = new Color(this.pixelData.getRGB(i, j), true);
                color = new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
                this.pixelData.setRGB(i, j, color.getRGB());
            }
        }
    }
    public void convertToTransparent() {
        for (int i=0; i < this.pixelData.getWidth(); i++){
            for( int j=0; j < this.pixelData.getHeight(); j++){
                Color color = new Color(this.pixelData.getRGB(i, j));
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                int a = color.getAlpha();
//                int x = (r + g + b) / 4;
                    Color transparent = new Color (g, b, r, a);
                    this.pixelData.setRGB(i, j, transparent.getRGB());
// test test 

//                Color grayColor = new Color (gray, gray, gray);
//                this.pixelData.setRGB(i, j, grayColor.getRGB());
            }
        }
    }
}