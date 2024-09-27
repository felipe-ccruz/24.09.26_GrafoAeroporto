public class Edge {
    String name;
    int distance;
    Airport source;
    Airport target;
    public Edge(String name, int distance, Airport source, Airport target) {
        this.name = name;
        this.distance = distance;
        this.source = source;
        this.target = target;

    }
    public Edge(int distance, Airport source, Airport target) {
        this.distance = distance;
        this.source = source;
        this.target = target;

    }

    public void printInfo(){
        System.out.print("[" + getSource().getName() + ", " + getTarget().getName() + "]");
    }

    public void printStatus() {
        System.out.println("\n\n-----------------------EDGE--" + getName() + "-----------------------");
        System.out.println("- SOURCE: " + source.getName());
        System.out.println("- TARGET: " + target.getName());
        System.out.println("-------------------------");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public Airport getSource() {
        return source;
    }
    public void setSource(Airport source) {
        this.source = source;
    }
    public Airport getTarget() {
        return target;
    }
    public void setTarget(Airport target) {
        this.target = target;
    }


}