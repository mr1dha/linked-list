public class Data {
    private String name;
    private int freq;
    private Linkedlist title = new Linkedlist();

    public Data(String name) {
        this.name = name;
        this.freq = 1;
    }

    public String getName() {
        return this.name;
    }

    public int getFreq() {
        return this.freq;
    }

    public void addFreq() {
        this.freq++;
    }

    public void addJudul(String artikel) {
        title.add(artikel);
    }

    public void getJudul() {
        Node current = title.getHead();
        int i = 1;
        while (current != null) {
            System.out.println(i + ". " + current.getData().getName());
            if (current.getNext() == null) {
                break;
            }
            current = current.getNext();
            i++;
        }
    }
}