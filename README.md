# Java Hesap Makinesi Projesi

Bu proje, fonksiyonlar kullanılarak yazılmış bir Java hesap makinesidir. Proje, toplama, çıkarma, çarpma ve bölme işlemlerini gerçekleştirmek için farklı metodlar kullanmaktadır. Fonksiyonları kullanarak kodunuzu daha modüler, okunabilir ve yeniden kullanılabilir hale getirmeyi amaçlamaktadır.

## Özellikler

- **Menü Gösterimi** (`menu` metodu): Kullanıcıya hangi işlemi yapmak istediğini soran bir menü gösterir.
- **Hesaplama** (`Hesapla` metodu): Toplama, çıkarma, çarpma ve bölme işlemlerini gerçekleştirir.

## Metodlar

- **`static void menu()`**: 
    - Kullanıcıya mevcut aritmetik işlemleri sunar.
    - Kullanıcı bu menü üzerinden hangi işlemi yapmak istediğini seçebilir.
  
- **`static double Hesapla(double a, double b, int islem)`**: 
    - İki sayı ve bir işlem türü alır. 
    - Seçilen işleme göre hesaplama yapar ve sonucu döndürür.
    - Desteklenen işlemler: Toplama (1), Çıkarma (2), Çarpma (3), Bölme (4).
