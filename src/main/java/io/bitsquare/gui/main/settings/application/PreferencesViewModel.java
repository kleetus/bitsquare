/*
 * This file is part of Bitsquare.
 *
 * Bitsquare is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bitsquare is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bitsquare. If not, see <http://www.gnu.org/licenses/>.
 */

package io.bitsquare.gui.main.settings.application;

import com.google.inject.Inject;

import viewfx.model.ViewModel;
import viewfx.model.support.ActivatableWithDelegate;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

class PreferencesViewModel extends ActivatableWithDelegate<PreferencesDataModel> implements ViewModel {

    @Inject
    public PreferencesViewModel(PreferencesDataModel delegate) {
        super(delegate);
    }

    public ObservableList<String> getBtcDenominationItems() {
        return delegate.btcDenominations;
    }

    BooleanProperty useAnimations() {
        return delegate.useAnimations;
    }

    BooleanProperty useEffects() {
        return delegate.useEffects;
    }

    StringProperty btcDenomination() {
        return delegate.btcDenomination;
    }



}
