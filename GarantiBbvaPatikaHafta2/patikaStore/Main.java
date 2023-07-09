 public static void main(String[] args) {
        PatikaStore store = new PatikaStore();

        store.addProduct(new Phone(1, 3199.0, 0.1, 10, "SAMSUNG GALAXY A51", store.getBrandByName("Samsung"), "128 GB", "6.5 Inc", "4000", 6, "Siyah"));
        store.addProduct(new Phone(2, 7379.0, 0.0, 5, "iPhone 11 64 GB", store.getBrandByName("Apple"), "64 GB", "6.1 Inc", "3046", 6, "Mavi"));
        store.addProduct(new Phone(3, 4012.0, 0.2, 8, "Redmi Note 10 Pro 8GB", store.getBrandByName("Xiaomi"), "128 GB", "6.5 Inc", "4000", 12, "Beyaz"));

        store.addProduct(new Notebook(1, 7000.0, 0.0, 20, "HUAWEI Matebook 14", store.getBrandByName("Huawei"), "512 GB SSD", "14 Inc", "16 GB"));
        store.addProduct(new Notebook(2, 3699.0, 0.0, 15, "LENOVO V14 IGL", store.getBrandByName("Lenovo"), "1024 GB SSD", "14 Inc", "8 GB"));
        store.addProduct(new Notebook(3, 8199.0, 0.0, 25, "ASUS Tuf Gaming", store.getBrandByName("Asus"), "2048 GB SSD", "15.6 Inc", "32 GB"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    store.listProductsByCategory("Notebook");
                    break;
                case 2:
                    store.listProductsByCategory("Cep Telefonu");
                    break;
                case 3:
                    store.listAllBrands();
                    break;
                default:
                    System.out.println("Geçersiz tercih!");
                    break;
            }

            System.out.println();
        }
    }

    private Brand getBrandByName(String name) {
        for (Brand brand : brands) {
            if (brand.getName().equals(name)) {
                return brand;
            }
        }
        return null;
    }
}