import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DetailContainer {
    private final List<Detail> details;

    public DetailContainer() {
        this.details = new ArrayList<>();
    }

    public void addDetail(Detail detail) {
        details.add(detail);
    }

    public double getTotalWeightByForm(Form form) {
        return details.stream()
                .filter(d -> d.getForm() == form)
                .mapToDouble(Detail::getWeight)
                .sum();
    }

    public int getDetailCount() {
        return details.size();
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DetailContainer contains:\n");
        for (Detail detail : details) {
            sb.append(detail.toString()).append("\n");
        }
        return sb.toString();
    }
}
