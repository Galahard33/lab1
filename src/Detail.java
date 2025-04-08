
public class Detail {
    private final Form form;
    private final Material material;
    private final double weight;
    private final double size;

    /**
     * Constructor for Detail class
     * @param form form of the detail
     * @param material material of the detail
     * @param weight weight of the detail in grams
     * @param size size of the detail in millimeters
     */
    public Detail(Form form, Material material, double weight, double size) {
        this.form = form;
        this.material = material;
        this.weight = weight;
        this.size = size;
    }

    public Form getForm() {
        return form;
    }

    public Material getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("Detail{form=%s, material=%s, weight=%.2fg, size=%.2fmm}",
                form, material, weight, size);
    }
}