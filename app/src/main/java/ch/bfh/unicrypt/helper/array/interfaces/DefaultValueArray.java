/*
 * UniCrypt
 *
 *  UniCrypt(tm) : Cryptographical framework allowing the implementation of cryptographic protocols e.g. e-voting
 *  Copyright (C) 2014 Bern University of Applied Sciences (BFH), Research Institute for
 *  Security in the Information Society (RISIS), E-Voting Group (EVG)
 *  Quellgasse 21, CH-2501 Biel, Switzerland
 *
 *  Licensed under Dual License consisting of:
 *  1. GNU Affero General Public License (AGPL) v3
 *  and
 *  2. Commercial license
 *
 *
 *  1. This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Affero General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Affero General Public License for more details.
 *
 *   You should have received a copy of the GNU Affero General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 *  2. Licensees holding valid commercial licenses for UniCrypt may use this file in
 *   accordance with the commercial license agreement provided with the
 *   Software or, alternatively, in accordance with the terms contained in
 *   a written agreement between you and Bern University of Applied Sciences (BFH), Research Institute for
 *   Security in the Information Society (RISIS), E-Voting Group (EVG)
 *   Quellgasse 21, CH-2501 Biel, Switzerland.
 *
 *
 *   For further information contact <e-mail: unicrypt@bfh.ch>
 *
 *
 * Redistributions of files must retain the above copyright notice.
 */
package ch.bfh.unicrypt.helper.array.interfaces;

/**
 *
 * @author Rolf Haenni <rolf.haenni@bfh.ch>
 * @param <V>
 */
public interface DefaultValueArray<V extends Object>
	   extends ImmutableArray<V> {

	public V getDefault();

	// collects the indices of default values
	public Iterable<Integer> getIndices();

	// collects the indices of values different from the default
	public Iterable<Integer> getIndicesExcept();

	public int count();

	public int countPrefix();

	public int countSuffix();

	public ImmutableArray<V> insertAt(final int index);

	public ImmutableArray<V> replaceAt(int index);

	public ImmutableArray<V> add();

	public ImmutableArray<V> appendPrefix(int n);

	public ImmutableArray<V> appendSuffix(int n);

	public ImmutableArray<V> appendPrefixAndSuffix(int n, int m);

	public ImmutableArray<V> removePrefix();

	public ImmutableArray<V> removeSuffix();

	// left here means making the array smaller
	public ImmutableArray<V> shiftLeft(int n);

	// right here means making the array larger and fill up with default value
	public ImmutableArray<V> shiftRight(int n);

}
