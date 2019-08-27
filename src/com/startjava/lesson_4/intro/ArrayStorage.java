/**
 * Array based storage for Resumes
 */
package com.startjava.lesson_4.intro;

import java.util.Arrays;


public class ArrayStorage {

    private int counter = 0;

    Resume[] storage = new Resume[10];

    void clear() {
        Arrays.fill(storage, null);
    }

    void save(Resume r) {
        storage[counter] = r;
        counter++;
    }

    Resume get(String uuid) {
            for (Resume r: storage) {
                if ((r.uuid).equals(uuid)) {
                    return r;
                }
            }
       return null;
    }


    void delete(String uuid) {
        for (int i = 0; i < storage.length; i++){
            if ((storage[i].uuid).equals(uuid)) {
                (storage[i].uuid).equals(null);
                for (int j = i; j < storage.length; j++) {
                    storage[j - 1] = storage[j];
                }
            }
        }
    }
    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        return Arrays.copyOf(storage, storage.length);
    }

    int size() {
        int j = 0;
        for (Resume r : storage) {
            if (r != null) {
                j++;
            }
        }
        return j;
    }
}