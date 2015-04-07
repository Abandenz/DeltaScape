// Item Spawn Points by xerozcheez

public class npcspawnpoints {
    public static int spawntimer = 0;

    public static void LoadNpcs() {
        for (int i = 0; i <= 5000; i++) {
            if (spawntimer <= 1) {
                NPCHandler.newNPC(33, 3210, 3215, 1, 10, 10, 10, 10, 0, 10, true);
                spawntimer = 100;
            }
        }
    }

    public static void process() {
        LoadNpcs();
        spawntimer -= 1;
    }
}