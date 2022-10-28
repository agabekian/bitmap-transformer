package bitmap.transformer;

import java.io.IOException;

    public class App {

        public static void main(String[] args) throws IOException {

                String file = args[0];

                Bitmap bitMapFromFile = new Bitmap(file);

                // use switch to determine action based on input
                switch (args[2]) {
                    case "greyscale":
                        bitMapFromFile.convertToGreyScale();
                        break;
                    case "negative":
                        bitMapFromFile.convertToNegative();
                        break;
                    case "transparent":
                        bitMapFromFile.convertWhiteToRed();
                        break;
                    default:
                        System.out.println("Did not recognize action");;
                }

                bitMapFromFile.write(args[1]);
            }
        }