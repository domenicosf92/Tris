package com.company;

public class BoardGame {
    public String[][] tris= new String[3][3];
    private String lastSign="";

    public String setSign(int column, int row, String sign){
        if(!this.lastSign.equalsIgnoreCase(sign)) {
            if (sign.equals("o") || sign.equals("x")){
                if (this.tris[column][row]==null) {
                    tris[column][row] = sign;
                    this.lastSign = sign;
                    if (this.rowWin() || this.columnWin() || this.diagonalWin()) {
                        return sign + " win";
                    }
                } else {
                    return "Another sign already present. You can't write here";
                }
            } else {
                return "Invalid sign";
            }
        } else {
            return "This is not your turn";
        }
        return "ok";
    }

    public String getSign(int column, int row) {
        return this.tris[column][row];
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
                System.out.print(this.tris[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    private boolean rowWin(){
        if ((this.tris[0][0] + this.tris[0][1] + this.tris[0][2]).equals("xxx")) {
            return true;
        }else if ((this.tris[0][0] + this.tris[0][1] + this.tris[0][2]).equals("ooo")) {
            return true;
        }

        if ((this.tris[1][0] + this.tris[1][1] + this.tris[1][2]).equals("xxx")) {
            return true;
        }else if ((this.tris[1][0] + this.tris[1][1] + this.tris[1][2]).equals("ooo")) {
            return true;
        }

        if ((this.tris[2][0] + this.tris[2][1] + this.tris[2][2]).equals("xxx")) {
            return true;
        }else if ((this.tris[2][0] + this.tris[2][1] + this.tris[2][2]).equals("ooo")){
            return true;
        }
        return false;
    }

    private boolean columnWin(){
        if ((this.tris[0][0] + this.tris[1][0] + this.tris[2][0]).equals("xxx")) {
            return true;
        }else if ((this.tris[0][0] + this.tris[1][0] + this.tris[2][0]).equals("ooo")) {
            return true;
        }

        if ((this.tris[0][1] + this.tris[1][1] + this.tris[2][1]).equals("xxx")) {
            return true;
        }else if ((this.tris[0][1] + this.tris[1][1] + this.tris[2][1]).equals("ooo")) {
            return true;
        }

        if ((this.tris[0][2] + this.tris[1][2] + this.tris[2][2]).equals("xxx")) {
            return true;
        }else if ((this.tris[0][2] + this.tris[1][2] + this.tris[2][2]).equals("ooo")) {
            return true;
        }
        return false;
    }

    private boolean diagonalWin(){
        if ((this.tris[0][0] + this.tris[1][1] + this.tris[2][2]).equals("xxx")) {
            return true;
        }else if ((this.tris[0][0] + this.tris[1][1] + this.tris[2][2]).equals("ooo")) {
            return true;
        }

        if ((this.tris[0][2] + this.tris[1][1] + this.tris[2][0]).equals("xxx")) {
            return true;
        }else if ((this.tris[0][2] + this.tris[1][1] + this.tris[2][0]).equals("ooo")){
            return true;
        }
        return false;
    }
}
