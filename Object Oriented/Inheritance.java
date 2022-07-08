public class Inheritance {

    public static void main(String args[]){
        tables t = new tables(10,15,20);
        t.setTable_type("Dining table");
        System.out.println("Table is a "+t.getTable_type() + " and has dimensions "+t.x +" "+t.y+""+" "+t.z);
    }
    
}

class Size3D{
     int x, y, z;
}

class tables extends Size3D{
    private String table_type;

    public String getTable_type() {
        return table_type;
    }

    public void setTable_type(String table_type) {
        this.table_type = table_type;
    }
    public tables(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}