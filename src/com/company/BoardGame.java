package com.company;

public class BoardGame {
    public String[][] tris= new String[3][3];
    private String lastSign;

    public String setSign(int column, int row, String sign){
        if(!this.lastSign.equalsIgnoreCase(sign)) {
            if (this.tris[column][row].equals("o") || this.tris[column][row].equals("x")){
                    tris[column][row] = sign;
                    this.lastSign = sign;
                    return "ok";
            } else return "Invalid sign";
        } else return "Another sign is already present, you can't write here";
    }

    public String getSign(int column, int row) {
        if (this.tris[column][row]!=null) {
            return this.tris[column][row];
        }else return null;
    }

    public void resetBoard(){
        for (int i=0; i<tris.length;i++){
            for (int j=0; j<tris.length;j++){
                this.tris[i][j]= null;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < tris.length; i++) {
            for (int j = 0; j < tris.length; j++) {
                System.out.println(this.tris[i][j] + "\n");
            }
            System.out.println("\n");
        }
    }

    private String rowWin(){
        if ((this.tris[0][0] + this.tris[0][1] + this.tris[0][2]).equals("x")) {
            return "x player win";
        }else if ((this.tris[0][0] + this.tris[0][1] + this.tris[0][2]).equals("o")) {
            return "o player win";
        }

        if ((this.tris[1][0] + this.tris[1][1] + this.tris[1][2]).equals("x")) {
            return "x player win";
        }else if ((this.tris[1][0] + this.tris[1][1] + this.tris[1][2]).equals("o")) {
            return "o player win";
        }

        if ((this.tris[2][0] + this.tris[2][1] + this.tris[2][2]).equals("x")) {
            return "x player win";
        }else if ((this.tris[2][0] + this.tris[2][1] + this.tris[2][2]).equals("o")){
            return "o player win";
        }
        return null;
    }

    private String columnWin(){
        if ((this.tris[0][0] + this.tris[1][0] + this.tris[2][0]).equals("x")) {
            return "x player win";
        }else if ((this.tris[0][0] + this.tris[1][0] + this.tris[2][0]).equals("o")) {
            return "o player win";
        }

        if ((this.tris[0][1] + this.tris[1][1] + this.tris[2][1]).equals("x")) {
            return "x player win";
        }else if ((this.tris[0][1] + this.tris[1][1] + this.tris[2][1]).equals("o")) {
            return "o player win";
        }

        if ((this.tris[0][2] + this.tris[1][2] + this.tris[2][2]).equals("x")) {
            return "x player win";
        }else if ((this.tris[0][2] + this.tris[1][2] + this.tris[2][2]).equals("o")) {
            return "o player win";
        }
        return null;
    }

    private String diagonalWin(){
        if ((this.tris[0][0] + this.tris[1][1] + this.tris[2][2]).equals("x")) {
            return "x player win";
        }else if ((this.tris[0][0] + this.tris[1][1] + this.tris[2][2]).equals("o")) {
            return "o player win";
        }

        if ((this.tris[0][2] + this.tris[1][1] + this.tris[2][0]).equals("x")) {
            return "x player win";
        }else if ((this.tris[0][2] + this.tris[1][1] + this.tris[2][0]).equals("o")){
            return "o player win";
        }
        return null;
    }
}
