package org.example;

import java.util.List;

public class ProductRepo {

    public List<Product> getAllProducts() {
        return List.of(
                new Product("P001", "Apple", "iPhone 15 Pro", "Smartphone mit Titan-Gehäuse und A17 Pro Chip", 1199.00),
                new Product("P001", "Apple", "iPhone 15 Pro", "Smartphone mit Titan-Gehäuse und A17 Pro Chip", 1199.00),
                new Product("P002", "Apple", "MacBook Air M3", "13-Zoll Laptop mit M3 Chip und 8GB RAM", 1299.00),
                new Product("P003", "Samsung", "Galaxy S24 Ultra", "Flaggschiff-Smartphone mit S-Pen und AI-Features", 1449.00),
                new Product("P004", "Samsung", "Odyssey OLED G9", "49-Zoll Curved Gaming-Monitor mit 240Hz", 1399.90),
                new Product("P005", "Sony", "WH-1000XM5", "Wireless Noise-Cancelling Kopfhörer", 329.00),
                new Product("P006", "Sony", "PlayStation 5 Slim", "Spielekonsole mit 1TB SSD Speicher", 549.99),
                new Product("P007", "Logitech", "MX Master 3S", "Ergonomische kabellose Performance-Maus", 99.90),
                new Product("P008", "Logitech", "MX Keys S", "Kabellose beleuchtete Tastatur", 109.00),
                new Product("P009", "Dell", "XPS 15", "Premium Laptop mit OLED Display und RTX Graphics", 1899.00),
                new Product("P010", "Dell", "UltraSharp U2723QE", "27-Zoll 4K USB-C Monitor für Professionals", 579.00),
                new Product("P011", "Bose", "QuietComfort Ultra", "Premium Over-Ear Kopfhörer mit Spatial Audio", 399.95),
                new Product("P012", "Bose", "SoundLink Flex", "Wasserdichter Bluetooth-Lautsprecher", 129.00),
                new Product("P013", "Nintendo", "Switch OLED", "Handheld-Konsole mit 7-Zoll OLED Screen", 339.00),
                new Product("P014", "Asus", "ROG Ally Z1 Extreme", "Handheld Gaming PC mit Windows 11", 649.00),
                new Product("P015", "Asus", "ROG Swift PG27AQDM", "27-Zoll QHD OLED Gaming Monitor", 899.00),
                new Product("P016", "Lenovo", "ThinkPad X1 Carbon", "Leichter Business-Laptop der Extraklasse", 1750.00),
                new Product("P017", "Anker", "737 PowerBank", "24.000mAh Powerbank mit 140W Ladeleistung", 119.99),
                new Product("P018", "Anker", "Soundcore Motion 300", "Kompakter Bluetooth-Speaker mit Hi-Res Audio", 79.99),
                new Product("P019", "Garmin", "Fenix 7 Pro", "Multisport-GPS-Smartwatch mit Solar-Ladelinse", 749.00),
                new Product("P020", "Garmin", "Forerunner 265", "Laufuhr mit AMOLED-Display und Erholungs-Analyse", 429.00),
                new Product("P021", "Dyson", "V15 Detect", "Kabelloser Akku-Staubsauger mit Laser-Erkennung", 699.00),
                new Product("P022", "Philips", "Airfryer XXL", "Heißluftfritteuse mit NutriU App Anbindung", 249.99),
                new Product("P023", "Philips", "Hue Starter Set", "Smart Home Beleuchtungs-Set mit 3x E27 & Bridge", 149.00),
                new Product("P024", "Sennheiser", "Momentum 4", "Kabelloser Kopfhörer mit 60 Stunden Akkulaufzeit", 289.00),
                new Product("P025", "LG", "OLED55C3", "55-Zoll 4K Smart TV mit 120Hz & Dolby Vision", 1299.00),
                new Product("P026", "Keychron", "K2 Pro", "Mechanische Bluetooth-Tastatur mit QMK/VIA", 119.00),
                new Product("P027", "Elgato", "Stream Deck MK.2", "Studio-Controller mit 15 anpassbaren LCD-Tasten", 139.99),
                new Product("P028", "Rode", "NT-USB Mini", "Kompaktes USB-Kondensatormikrofon", 99.00),
                new Product("P029", "Kindle", "Paperwhite Signature", "E-Reader mit 6.8-Zoll Display und kabellosem Laden", 169.99),
                new Product("P030", "Sonos", "Era 100", "Smarter WLAN-Lautsprecher mit Bluetooth & AirPlay", 229.00)
        );
    }
}

