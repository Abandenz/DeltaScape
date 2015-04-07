// Item Spawn Points by xerozcheez

public class itemspawnpoints {
    public int spawntimer = 0;

    public void LoadItems() {
        for (int i = 0; i <= 5000; i++) {
            if (spawntimer <= 1) {
                ItemHandler.addItem(2414, 3217, 3218, 1, ItemHandler.globalItemController[i], false); // Zammy Cape
                ItemHandler.addItem(2412, 3119, 9848, 1, ItemHandler.globalItemController[i], false); // Sara Cape
                ItemHandler.addItem(2413, 3120, 9848, 1, ItemHandler.globalItemController[i], false); // Guthix Cape
                ItemHandler.addItem(1149, 3217, 3218, 1, ItemHandler.globalItemController[i], false);
                ItemHandler.addItem(1187, 3217, 3218, 1, ItemHandler.globalItemController[i], false);
                ItemHandler.addItem(1305, 3217, 3218, 1, ItemHandler.globalItemController[i], false);
                spawntimer = 100;
            }
        }
    }

    public void process() {
        LoadItems();
        spawntimer -= 1;
    }
}