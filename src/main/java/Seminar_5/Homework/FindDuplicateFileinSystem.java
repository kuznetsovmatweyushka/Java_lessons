package Seminar_5.Homework;

import java.util.*;

public class FindDuplicateFileinSystem {
    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));

    }

    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> lst = new ArrayList<>();
        for (String path : paths) {
            String[] dir = path.split(" ");
            String dirPath = dir[0];
            for (int i = 1; i < dir.length; i++) {
                int open = dir[i].indexOf('(');
                int close = dir[i].indexOf(')');
                String nameFile = dir[i].substring(open, close);
                if (!map.containsKey(nameFile)) {
                    map.put(nameFile, new ArrayList<>());
                }
                map.get(nameFile).add(dirPath + "/" + dir[i].substring(0, open));
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                lst.add(map.get(key));
            }
        }
        return lst;
    }
}

