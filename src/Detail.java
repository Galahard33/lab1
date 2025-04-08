/**
 * Class representing a detail with form, material, weight and size
 */
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

    /**
     * Gets the form of the detail
     * @return form enum
     */
    public Form getForm() {
        return form;
    }

    /**
     * Gets the material of the detail
     * @return material enum
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Gets the weight of the detail
     * @return weight in grams
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Gets the size of the detail
     * @return size in millimeters
     */
    public double getSize() {
        return size;
    }

    /**
     * Returns string representation of the detail
     * @return formatted string with detail properties
     */
    @Override
    public String toString() {
        return String.format("Detail{form=%s, material=%s, weight=%.2fg, size=%.2fmm}",
                form, material, weight, size);
    }
}