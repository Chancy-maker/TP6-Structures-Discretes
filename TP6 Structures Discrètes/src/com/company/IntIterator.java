package com.company;

/**
 * Interface IntIterator.
 */
public interface IntIterator {
    /**
     * La méthode next() retourne la donnée portée par cette position
     * courante et passe à la position suivante (qui devient la nouvelle position courante.
     * @return
     */
    int next();

    /**
     *  la méthode hasNext() permet de testé  si la position courante possède une position suivante
     * @return
     */
    boolean hasNext();
}
