
public class Main {
    public static void main(String[] args) {
        DetailContainer container = new DetailContainer();

        // Add 10 different details
        container.addDetail(new Detail(Form.CIRCLE, Material.STEEL, 15.5, 10.0));
        container.addDetail(new Detail(Form.SQUARE, Material.ALUMINUM, 20.0, 15.0));
        container.addDetail(new Detail(Form.TRIANGLE, Material.PLASTIC, 5.5, 8.0));
        container.addDetail(new Detail(Form.RECTANGLE, Material.COPPER, 30.2, 25.0));
        container.addDetail(new Detail(Form.HEXAGON, Material.WOOD, 12.3, 12.0));
        container.addDetail(new Detail(Form.CIRCLE, Material.ALUMINUM, 18.0, 12.0));
        container.addDetail(new Detail(Form.SQUARE, Material.STEEL, 25.5, 18.0));
        container.addDetail(new Detail(Form.TRIANGLE, Material.WOOD, 8.0, 10.0));
        container.addDetail(new Detail(Form.RECTANGLE, Material.PLASTIC, 15.0, 20.0));
        container.addDetail(new Detail(Form.CIRCLE, Material.COPPER, 22.0, 15.0));

        System.out.println(container);

        double circleWeight = container.getTotalWeightByForm(Form.CIRCLE);
        System.out.printf("Общий вес деталей круглой формы: %.2fg%n", circleWeight);

        System.out.println("Количество деталей: " + container.getDetailCount());

        Detail uniqueFormDetail = container.findUniqueFormDetail();
        if (uniqueFormDetail != null) {
            System.out.println("Деталь с уникальной формой: " + uniqueFormDetail);
        } else {
            System.out.println("Нет Детали с уникальной формой");
        }
    }
}