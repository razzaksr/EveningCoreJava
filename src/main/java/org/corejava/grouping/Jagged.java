package org.corejava.grouping;

public class Jagged {
    public static void main(String[] args) {
        String[][] techs={{"spring","jpa","react"},
                {"flask","angular"},
                {"express","react","node","mongodb"}};

        // traverse
        for(int row=0;row<techs.length;row++){
            for(int col=0;col<techs[row].length;col++){
                System.out.print(techs[row][col]+" ");
            }
            System.out.println();
        }
    }
}
