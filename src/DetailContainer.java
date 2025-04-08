import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Container class for storing and processing details
 */
public class DetailContainer {
    private final List<Detail> details;

    /**
     * Constructor for DetailContainer
     */
    public DetailContainer() {
        this.details = new ArrayList<>();
    }

    /**
     * Adds a detail to the container
     * @param detail detail to add
     */
    public void addDetail(Detail detail) {
        details.add(detail);
    }

    /**
     * Calculates total weight of details with specific form
     * @param form form to filter by
     * @return total weight in grams
     */
    public double getTotalWeightByForm(Form form) {
        return details.stream()
                .filter(d -> d.getForm() == form)
                .mapToDouble(Detail::getWeight)
                .sum();
    }

    /**
     * Gets total count of details in container
     * @return number of details
     */
    public int getDetailCount() {
        return details.size();
    }

    /**
     * Finds a detail with unique form (only one detail with this form exists)
     * @return detail with unique form or null if not found
     */
    public Detail findUniqueFormDetail() {
        Map<Form, Integer> formCount = new HashMap<>();
        Map<Form, Detail> formDetail = new HashMap<>();

        for (Detail detail : details) {
            formCount.put(detail.getForm(), formCount.getOrDefault(detail.getForm(), 0) + 1);
            formDetail.put(detail.getForm(), detail);
        }

        for (Map.Entry<Form, Integer> entry : formCount.entrySet()) {
            if (entry.getValue() == 1) {
                return formDetail.get(entry.getKey());
            }
        }

        return null;
    }

    /**
     * Returns string representation of the container
     * @return formatted string with container contents
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DetailContainer contains:\n");
        for (Detail detail : details) {
            sb.append(detail.toString()).append("\n");
        }
        return sb.toString();
    }
}
