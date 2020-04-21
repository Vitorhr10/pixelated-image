/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteres;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import static javax.swing.Spring.height;

/**
 *
 * @author Vitor
 */
public class Caracteres {

    /**
     * @param args the command line arguments
     */
    static int w = 0; static int h = 12;

    static int[] corBranco = new int[]{255, 255, 255};
    static int[] corPreto = new int[]{0, 0, 0};
    static int[] corVermelho = new int[]{255, 0, 0};

    static int countAspas = 0;
    static int countAspasSimples = 0;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String palavra = "";
       
        System.out.print("Digite uma Palavra: ");
        palavra = sc.nextLine().toUpperCase();
        
        w = palavra.length()*16;

        BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = image.getRaster();
        
        pulaLinha();
        System.out.println("Palavra digitada: " + palavra);

        char letra;
        int ascii = 0;
        int pos = 0;

        Caracteres.clear(raster);
        for (int c = 0; c < palavra.length(); c++) {
            letra = palavra.charAt(c);
            ascii = (int) letra;
            System.out.println("O código ASCII da posição (" + c + ") é: " + ascii);

            switch (ascii) {
                case 32:
                    /*
                        * CARACTER ESPECIAL ESPAÇO
                    */
                    pos = Caracteres.ascii32(pos, raster);
                    break;
                case 33:
                    /*
                        * CARACTER ESPECIAL !
                    */
                    pos = Caracteres.ascii33(pos, raster);
                    break;
                case 34:
                    /*
                        * CARACTER ESPECIAL "
                    */
                    countAspas++;
                    pos = Caracteres.ascii34(pos, raster);
                    break;
                case 35:
                    /*
                        * CARACTER ESPECIAL #
                    */
                    pos = Caracteres.ascii35(pos, raster);
                    break;
                case 36:
                    /*
                        * CARACTER ESPECIAL $
                    */
                    pos = Caracteres.ascii36(pos, raster);
                    break;
                case 37:
                    /*
                        * CARACTER ESPECIAL %
                    */
                    pos = Caracteres.ascii37(pos, raster);
                    break;
                case 38:
                    /*
                        * CARACTER ESPECIAL &
                    */
                    pos = Caracteres.ascii38(pos, raster);
                    break;
                case 39:
                    /*
                        * CARACTER ESPECIAL '
                    */
                    countAspasSimples++;
                    pos = Caracteres.ascii39(pos, raster);
                    break;
                case 40:
                    /*
                        * CARACTER ESPECIAL (
                    */
                    pos = Caracteres.ascii40(pos, raster);
                    break;
                case 41:
                    /*
                        * CARACTER ESPECIAL )
                    */
                    pos = Caracteres.ascii41(pos, raster);
                    break;
                case 42:
                    /*
                        * CARACTER ESPECIAL *
                    */
                    pos = Caracteres.ascii42(pos, raster);
                    break;
                case 43:
                    /*
                        * CARACTER ESPECIAL +
                    */
                    pos = Caracteres.ascii43(pos, raster);
                    break;
                case 44:
                    /*
                        * CARACTER ESPECIAL ,
                    */
                    pos = Caracteres.ascii44(pos, raster);
                    break;
                case 45:
                    /*
                        * CARACTER ESPECIAL -
                    */
                    pos = Caracteres.ascii45(pos, raster);
                    break;
                case 46:
                    /*
                        * CARACTER ESPECIAL .
                    */
                    pos = Caracteres.ascii46(pos, raster);
                    break;
                case 47:
                    /*
                        * CARACTER ESPECIAL /
                    */
                    pos = Caracteres.ascii47(pos, raster);
                    break;
                case 48:
                    /*
                        * NÚMERO 0
                    */
                    pos = Caracteres.ascii48(pos, raster);
                    break;
                case 49:
                    /*
                        * NÚMERO 1
                    */
                    pos = Caracteres.ascii49(pos, raster);
                    break;
                case 50:
                    /*
                        * NÚMERO 2
                    */
                    pos = Caracteres.ascii50(pos, raster);
                    break;
                case 51:
                    /*
                        * NÚMERO 3
                    */
                    pos = Caracteres.ascii51(pos, raster);
                    break;
                case 52:
                    /*
                        * NÚMERO 4
                    */
                    pos = Caracteres.ascii52(pos, raster);
                    break;
                case 53:
                    /*
                        * NÚMERO 5
                    */
                    pos = Caracteres.ascii53(pos, raster);
                    break;
                case 54:
                    /*
                        * NÚMERO 6
                    */
                    pos = Caracteres.ascii54(pos, raster);
                    break;
                case 55:
                    /*
                        * NÚMERO 7
                    */
                    pos = Caracteres.ascii55(pos, raster);
                    break;
                case 56:
                    /*
                        * NÚMERO 8
                    */
                    pos = Caracteres.ascii56(pos, raster);
                    break;
                case 57:
                    /*
                        * NÚMERO 9
                    */
                    pos = Caracteres.ascii57(pos, raster);
                    break;
                case 58:
                    /*
                        * CARACTER ESPECIAL :
                    */
                    pos = Caracteres.ascii58(pos, raster);
                    break;
                case 59:
                    /*
                        * CARACTER ESPECIAL ;
                    */
                    pos = Caracteres.ascii59(pos, raster);
                    break;
                case 60:
                    /*
                        * CARACTER ESPECIAL <
                    */
                    pos = Caracteres.ascii60(pos, raster);
                    break;
                case 61:
                    /*
                        * CARACTER ESPECIAL =
                    */
                    pos = Caracteres.ascii61(pos, raster);
                    break;
                case 62:
                    /*
                        * CARACTER ESPECIAL >
                    */
                    pos = Caracteres.ascii62(pos, raster);
                    break;
                case 63:
                    /*
                        * CARACTER ESPECIAL ?
                    */
                    pos = Caracteres.ascii63(pos, raster);
                    break;
                case 64:
                    /*
                        * CARACTER ESPECIAL @
                    */
                    pos = Caracteres.ascii64(pos, raster);
                    break;
                case 65:
                    /*
                        * LETRA A
                    */
                    pos = Caracteres.ascii65(pos, raster);
                    break;
                case 66:
                    /*
                        * LETRA B
                    */
                    pos = Caracteres.ascii66(pos, raster);
                    break;
                case 67:
                    /*
                        * LETRA C
                    */
                    pos = Caracteres.ascii67(pos, raster);
                    break;
                case 68:
                    /*
                        * LETRA D
                    */
                    pos = Caracteres.ascii68(pos, raster);
                    break;
                case 69:
                    /*
                        * LETRA E
                    */
                    pos = Caracteres.ascii69(pos, raster);
                    break;
                case 70:
                    /*
                        * LETRA F
                    */
                    pos = Caracteres.ascii70(pos, raster);
                    break;
                case 71:
                    /*
                        * LETRA G
                    */
                    pos = Caracteres.ascii71(pos, raster);
                    break;
                case 72:
                    /*
                        * LETRA H
                    */
                    pos = Caracteres.ascii72(pos, raster);
                    break;
                case 73:
                    /*
                        * LETRA I
                    */
                    pos = Caracteres.ascii73(pos, raster);
                    break;
                case 74:
                    /*
                        * LETRA J
                    */
                    pos = Caracteres.ascii74(pos, raster);
                    break;
                case 75:
                    /*
                        * LETRA K
                    */
                    pos = Caracteres.ascii75(pos, raster);
                    break;
                case 76:
                    /*
                        * LETRA L
                    */
                    pos = Caracteres.ascii76(pos, raster);
                    break;
                case 77:
                    /*
                        * LETRA M
                    */
                    pos = Caracteres.ascii77(pos, raster);
                    break;
                case 78:
                    /*
                        * LETRA N
                    */
                    pos = Caracteres.ascii78(pos, raster);
                    break;
                case 79:
                    /*
                        * LETRA O
                    */
                    pos = Caracteres.ascii79(pos, raster);
                    break;
                case 80:
                    /*
                        * LETRA P
                    */
                    pos = Caracteres.ascii80(pos, raster);
                    break;
                case 81:
                    /*
                        * LETRA Q
                    */
                    pos = Caracteres.ascii81(pos, raster);
                    break;
                case 82:
                    /*
                        * LETRA R
                    */
                    pos = Caracteres.ascii82(pos, raster);
                    break;
                case 83:
                    /*
                        * LETRA S
                    */
                    pos = Caracteres.ascii83(pos, raster);
                    break;
                case 84:
                    /*
                        * LETRA T
                    */
                    pos = Caracteres.ascii84(pos, raster);
                    break;
                case 85:
                    /*
                        * LETRA U
                    */
                    pos = Caracteres.ascii85(pos, raster);
                    break;
                case 86:
                    /*
                        * LETRA V
                    */
                    pos = Caracteres.ascii86(pos, raster);
                    break;
                case 87:
                    /*
                        * LETRA W
                    */
                    pos = Caracteres.ascii87(pos, raster);
                    break;
                case 88:
                    /*
                        * LETRA X
                    */
                    pos = Caracteres.ascii88(pos, raster);
                    break;
                case 89:
                    /*
                        * LETRA Y
                    */
                    pos = Caracteres.ascii89(pos, raster);
                    break;
                case 90:
                    /*
                        * LETRA Z
                    */
                    pos = Caracteres.ascii90(pos, raster);
                    break;
                case 91:
                    /*
                        * CARACTER ESPECIAL [
                    */
                    pos = Caracteres.ascii91(pos, raster);
                    break;
                case 92:
                    /*
                        * CARACTER ESPECIAL \
                    */
                    pos = Caracteres.ascii92(pos, raster);
                    break;
                case 93:
                    /*
                        * CARACTER ESPECIAL ]
                    */
                    pos = Caracteres.ascii93(pos, raster);
                    break;
                case 95:
                    /*
                        * CARACTER ESPECIAL _
                    */
                    pos = Caracteres.ascii95(pos, raster);
                    break;
                case 123:
                    /*
                        * CARACTER ESPECIAL {
                    */
                    pos = Caracteres.ascii123(pos, raster);
                    break;
                case 124:
                    /*
                        * CARACTER ESPECIAL |
                    */
                    pos = Caracteres.ascii124(pos, raster);
                    break;
                case 125:
                    /*
                        * CARACTER ESPECIAL }
                    */
                    pos = Caracteres.ascii125(pos, raster);
                    break;
                default:
                    System.out.println("Caracter não encontrado na base de dados:");
                    System.out.println("O exercício vai encerrar, por favor tente novamente com outro caracter!");
                    System.out.println("Pressione ENTER para continuar");
                    sc.nextLine();
                    break;
            }
        }
        ascii = 0;
        countAspas = 0;

        ImageIO.write(image, "PNG", new File("palavra.png"));
    }

    public static void pulaLinha() {
        for (int i = 0; i < 50; i++) {
            System.out.println(" ");
        }
    }
    
    /*
        * CARACTER ESPECIAL ESPAÇO
    */
    public static int ascii32(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 11 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corBranco);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * CARACTER ESPECIAL !
    */
    public static int ascii33(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 8) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 8;
    }

    /*
        * CARACTER ESPECIAL "
    */
    public static int ascii34(int pos, WritableRaster raster) {

        if (countAspas == 1) {
            for (int y = 0; y < h; y++) {
                for (int x = pos; x <= pos + 11; x++) {
                    if (x > pos && x < pos + 3 && y > 0 && y < 3) {
                        raster.setPixel(x, y, corPreto);
                    } else if (x > pos + 3 && x < pos + 6 && y > 0 && y < 3) {
                        raster.setPixel(x, y, corPreto);
                    } else if (x > pos && x < pos + 2 && y > 2 && y < 5) {
                        raster.setPixel(x, y, corPreto);
                    } else if (x > pos + 3 && x < pos + 5 && y > 2 && y < 5) {
                        raster.setPixel(x, y, corPreto);
                    } else {
                        raster.setPixel(x, y, corBranco);
                    }
                }
            }
        } else {
            for (int y = 0; y < h; y++) {
                for (int x = pos; x <= pos + 11; x++) {
                    if (x > pos && x < pos + 3 && y > 0 && y < 3) {
                        raster.setPixel(x, y, corPreto);
                    } else if (x > pos + 3 && x < pos + 6 && y > 0 && y < 3) {
                        raster.setPixel(x, y, corPreto);
                    } else if (x > pos + 1 && x < pos + 3 && y > 2 && y < 5) {
                        raster.setPixel(x, y, corPreto);
                    } else if (x > pos + 4 && x < pos + 6 && y > 2 && y < 5) {
                        raster.setPixel(x, y, corPreto);
                    } else {
                        raster.setPixel(x, y, corBranco);
                    }
                }
            }
        }
        return pos + 11;
    }

    /*
        * CARACTER ESPECIAL #
    */
    public static int ascii35(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos + 2 && x < pos + 5 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 11 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 11 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * CARACTER ESPECIAL $
    */
    public static int ascii36(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y >= 0 && y < 1) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 10 && y <= 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * CARACTER ESPECIAL %
    */
    public static int ascii37(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos + 1 && x < pos + 4 && y > 0 && y < 2) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 1 && x < pos + 4 && y > 3 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 2 && y > 1 && y < 4) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 3 && x < pos + 5 && y > 1 && y < 4) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 8 && y > 7 && y < 10) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 9 && x < pos + 11 && y > 7 && y < 10) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 7 && x < pos + 10 && y > 6 && y < 8) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 7 && x < pos + 10 && y > 9 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * CARACTER ESPECIAL &
    */
    public static int ascii38(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 8 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 8 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 7 && x < pos + 11 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * CARACTER ESPECIAL '
    */
    public static int ascii39(int pos, WritableRaster raster) {

        if (countAspasSimples == 1) {
            for (int y = 0; y < h; y++) {
                for (int x = pos; x <= pos + 11; x++) {
                    if (x > pos && x < pos + 3 && y > 0 && y < 3) {
                        raster.setPixel(x, y, corPreto);
                    } else if (x > pos && x < pos + 2 && y > 2 && y < 5) {
                        raster.setPixel(x, y, corPreto);
                    } else {
                        raster.setPixel(x, y, corBranco);
                    }
                }
            }
        } else {
            for (int y = 0; y < h; y++) {
                for (int x = pos; x <= pos + 11; x++) {
                    if (x > pos && x < pos + 3 && y > 0 && y < 3) {
                        raster.setPixel(x, y, corPreto);
                    } else if (x > pos + 1 && x < pos + 3 && y > 2 && y < 5) {
                        raster.setPixel(x, y, corPreto);
                    } else {
                        raster.setPixel(x, y, corBranco);
                    }
                }
            }
        }
        return pos + 8;
    }

    /*
        * CARACTER ESPECIAL (
    */
    public static int ascii40(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 10;
    }

    /*
        * CARACTER ESPECIAL )
    */
    public static int ascii41(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos + 2 && x < pos + 5 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 10;
    }

    /*
        * CARACTER ESPECIAL *
    */
    public static int ascii42(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 2 && y > 2 && y < 4) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 2 && y > 4 && y < 6) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 1 && x < pos + 3 && y > 3 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 4 && y > 1 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 3 && x < pos + 5 && y > 3 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 6 && y > 2 && y < 4) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 6 && y > 4 && y < 6) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 11;
    }

    /*
        * CARACTER ESPECIAL +
    */
    public static int ascii43(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 12;
    }

    /*
        * CARACTER ESPECIAL ,
    */
    public static int ascii44(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 1 && x < pos + 3 && y > 9 && y <= 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 8;
    }

    /*
        * CARACTER ESPECIAL -
    */
    public static int ascii45(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 12;
    }

    /*
        * CARACTER ESPECIAL .
    */
    public static int ascii46(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 8;
    }

    /*
        * CARACTER ESPECIAL /
    */
    public static int ascii47(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos + 8 && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * NÚMERO 0
    */
    public static int ascii48(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * NÚMERO 1
    */
    public static int ascii49(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 10;
    }

    /*
        * NÚMERO 2
    */
    public static int ascii50(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 6 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 11 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * NÚMERO 3
    */
    public static int ascii51(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * NÚMERO 4
    */
    public static int ascii52(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * NÚMERO 5
    */
    public static int ascii53(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * NÚMERO 6
    */
    public static int ascii54(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * NÚMERO 7
    */
    public static int ascii55(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 6 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * NÚMERO 8
    */
    public static int ascii56(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * NÚMERO 9
    */
    public static int ascii57(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * CARACTER ESPECIAL :
    */
    public static int ascii58(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 8;
    }

    /*
        * CARACTER ESPECIAL ;
    */
    public static int ascii59(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 1 && x < pos + 3 && y > 9 && y <= 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 8;
    }

    /*
        * CARACTER ESPECIAL <
    */
    public static int ascii60(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 12;
    }

    /*
        * CARACTER ESPECIAL =
    */
    public static int ascii61(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 7 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 7 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 12;
    }

    /*
        * CARACTER ESPECIAL >
    */
    public static int ascii62(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 12;
    }

    /*
        * CARACTER ESPECIAL ?
    */
    public static int ascii63(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 12;
    }

    /*
        * CARACTER ESPECIAL @
    */
    public static int ascii64(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA A
    */
    public static int ascii65(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (y > 0 && y < 3 && x > pos + 2 && x < pos + 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (y > 5 && y < 8 && x > pos + 2 && x < pos + 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
                
            }
        }
        return pos + 16;
    }

    /*
        * LETRA B
    */
    public static int ascii66(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA C
    */
    public static int ascii67(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA D
    */
    public static int ascii68(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA E
    */
    public static int ascii69(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 11 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 2 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA F
    */
    public static int ascii70(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 11 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA G
    */
    public static int ascii71(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 11 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA H
    */
    public static int ascii72(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA I
    */
    public static int ascii73(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 11 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA J
    */
    public static int ascii74(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 4 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 7 && x < pos + 10 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 5 && x < pos + 10 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 8 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 15;
    }

    /*
        * LETRA K
    */
    public static int ascii75(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA L
    */
    public static int ascii76(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 11 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA M
    */
    public static int ascii77(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA N
    */
    public static int ascii78(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA O
    */
    public static int ascii79(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 7 && x < pos + 10 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 8 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 8 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 15;
    }

    /*
        * LETRA P
    */
    public static int ascii80(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA Q
    */
    public static int ascii81(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 2 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 7 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA R
    */
    public static int ascii82(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 6 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA S
    */
    public static int ascii83(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos + 2 && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA T
    */
    public static int ascii84(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 2 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA U
    */
    public static int ascii85(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 0 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 9 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA V
    */
    public static int ascii86(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 0 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA W
    */
    public static int ascii87(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA X
    */
    public static int ascii88(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA Y
    */
    public static int ascii89(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * LETRA Z
    */
    public static int ascii90(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 11 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 11 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * CARACTER ESPECIAL [
    */
    public static int ascii91(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 10;
    }

    /*
        * CARACTER ESPECIAL \
    */
    public static int ascii92(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 2 && y < 5) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 6 && x < pos + 9 && y > 6 && y < 9) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 8 && x < pos + 11 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * CARACTER ESPECIAL ]
    */
    public static int ascii93(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 10;
    }

    /*
        * CARACTER ESPECIAL _
    */
    public static int ascii95(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 11 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 16;
    }

    /*
        * CARACTER ESPECIAL {
    */
    public static int ascii123(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 12;
    }

    /*
        * CARACTER ESPECIAL |
    */
    public static int ascii124(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 8;
    }

    /*
        * CARACTER ESPECIAL {
    */
    public static int ascii125(int pos, WritableRaster raster) {

        for (int y = 0; y < h; y++) {
            for (int x = pos; x <= pos + 11; x++) {
                if (x > pos && x < pos + 3 && y > 0 && y < 3) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos && x < pos + 3 && y > 8 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 2 && x < pos + 5 && y > 0 && y < 11) {
                    raster.setPixel(x, y, corPreto);
                } else if (x > pos + 4 && x < pos + 7 && y > 4 && y < 7) {
                    raster.setPixel(x, y, corPreto);
                } else {
                    raster.setPixel(x, y, corBranco);
                }
            }
        }
        return pos + 12;
    }

    public static void clear(WritableRaster raster) {
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                raster.setPixel(x, y, corBranco);

            }
        }
    }

}
