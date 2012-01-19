/**
	Copyright (c) 2011, Strata Health Solutions Inc.
 	All rights reserved.

	Redistribution and use in source and binary forms, with or without modification, are permitted 
	provided that the following conditions are met:

	Redistributions of source code must retain the above copyright notice, this list of conditions 
	and the following disclaimer.

	Redistributions in binary form must reproduce the above copyright notice, this list of conditions 
	and the following disclaimer in the documentation and/or other materials provided with the distribution.

	THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED 
	WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR 
	A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE 
	FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
	BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; 
	OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, 
	OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
	EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
**/

package shelob.core.interfaces;

import shelob.core.exceptions.NonExistentWebElementException;
import shelob.core.interfaces.elements.IElement;
import shelob.core.interfaces.elements.IElementCollection;

/**
 * @author melllaguno
 * @version $Revision: 1.0 $
 *
 * For pages that have Elements
 */
public interface IHasElements {

	/**
	 * Method getElements.
	 * @return IElementCollection
	 */
	IElementCollection getElements();
	
	/**
	 * Helper Method : delegates to the actual ElementCollection
	 * @param <T>
	 * @param label
	 * @return T
	 * @throws NonExistentWebElementException
	 */
	<T extends IElement> T find(String label) throws NonExistentWebElementException ; 
	
	/**
	 * Helper Method : delegates to the actual ElementCollection
	 * @param <T>
	 * @param label
	 * @param identifiers
	 * @return T
	 * @throws NonExistentWebElementException
	 */
	<T extends IElement> T find(String label, String...identifiers) throws NonExistentWebElementException;
	
	/**
	 * Helper Method : delegates to the actual ElementCollection 
	 * @param <T>
	 * @param type
	 * @param label
	 * @return T
	 * @throws NonExistentWebElementException
	 */
	<T extends IElement> T find(Class<T> type, String label) throws NonExistentWebElementException; // $codepro.audit.disable overloadedMethods
	
	/**
	 * Helper Method : delegates to the actual ElementCollection
	 * @param <T>
	 * @param type
	 * @param label
	 * @param identifiers
	 * @return T
	 * @throws NonExistentWebElementException
	 */
	<T extends IElement> T find(Class<T> type, String label, String...identifiers) throws NonExistentWebElementException;
}