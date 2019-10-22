package it.unive.ch9.e16;

import java.awt.*;

public class LabeledPoint  extends Point {
    private String label;
    public LabeledPoint(int x, int y, String label){
        super(x,y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString(){
        String parentToString = super.toString();
        // parentToString transformation used to delete the character "["
        String toAdd = String.format(",\"%s\"]", this.label);
        return parentToString.replace("]", toAdd);
    }

    public static void main(String[] args) {
        LabeledPoint b = new LabeledPoint(10, 10, "A beautiful label");
        System.out.println(b);
    }
}
