
    import java.util.Map;

    class InventorySnapshot {

        private final Map<String, Long> quantities;



        InventorySnapshot(Map<String, Long> quantities) {

            this.quantities = Map.copyOf(quantities);

        }


        long available(String componentCode) {

            return quantities.getOrDefault(componentCode, 0L);

        }

    }



    class StockViewer {

        private final InventorySnapshot stock;



        StockViewer(InventorySnapshot stock) {

            this.stock = stock;

        }



        void showWood() {

            System.out.println(

                    "Viewer remembers WOOD-A: "

                            + stock.available("WOOD-A")

            );

        }

    }



    public class main2 {

        public static void main(String[] args) {

            InventorySnapshot stock =

                    new InventorySnapshot(

                            Map.of("WOOD-A", 3000L)

                    );



            StockViewer viewer =

                    new StockViewer(stock);



            viewer.showWood();

            viewer.showWood();

        }

    }

