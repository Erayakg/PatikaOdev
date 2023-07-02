public class PatikaStore {
    private List<Brand> brands;
    private List<Product> products;

    public PatikaStore() {
        this.brands = new ArrayList<>();
        this.products = new ArrayList<>();

        initializeBrands();
    }

    private void initializeBrands() {
        List<String> brandNames = Arrays.asList("Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster");
        Collections.sort(brandNames);

        for (int i = 0; i < brandNames.size(); i++) {
            brands.add(new Brand(i + 1, brandNames.get(i)));
        }
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
    }

    public void listProductsByCategory(String category) {
        List<Product> categoryProducts = new ArrayList<>();

        for (Product product : products) {
            if (product.getCategory().equals(category)) {
                categoryProducts.add(product);
            }
        }

        if (categoryProducts.isEmpty()) {
            System.out.println("Bu kategoride ürün bulunmamaktadır.");
        } else {
            printProductTable(categoryProducts);
        }
    }

    public void listAllBrands() {
        System.out.println("Markalarımız");
        System.out.println("--------------");

        for (Brand brand : brands) {
            System.out.println("- " + brand.getName());
        }
    }

    private void printProductTable(List<Product> products) {
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");

        for (Product product : products) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10s | %-9s | %-12s |%n",
                    product.getId(), product.getName(), product.getPrice(), product.getBrand().getName(),
                    product.getStorage(), product.getScreenSize(), product.getRam());
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
    }
