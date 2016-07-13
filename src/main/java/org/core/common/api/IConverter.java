/**
 * 
 */
package org.core.common.api;

/**
 * Interfejs konwertera
 * @author piotrek
 *
 * @param <K> Typ obiektu wejściowego
 * @param <V> Typ obiektu wjściowego.
 */
public interface IConverter<K, V> {
	/**
	 * 
	 * @param source obiekt wejściowy do konwersji
	 * @return zwraca skonwertowany obiekt.
	 */
	V convert(K source);

}
