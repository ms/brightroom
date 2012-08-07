package com.btrll.rooms.client.activities;

import com.btrll.rooms.client.DetailViewGwtImpl;
import com.google.gwt.user.client.ui.HTML;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.Button;
import com.googlecode.mgwt.ui.client.widget.RoundPanel;

public class AboutViewGwtImpl extends DetailViewGwtImpl implements AboutView {

	private RoundPanel round;
	private Button button;

	public AboutViewGwtImpl() {

		round = new RoundPanel();

		round.add(new HTML("BrightRoom"));
		round.add(new HTML("HAX Version 8/16/2012"));
		round.add(new HTML(
				"Built by Jason Thrasher, <a target='_blank' href='http://www.twitter.com/thrasher'>@thrasher</a> on Twitter"));

		round.add(new HTML(
				"<br/><br/><a target='_blank' href='http://www.brightroll.com'>BrightRoll</a><br/><br/>"));

		if (MGWT.getOsDetection().isPhone()) {
			button = new Button("back");
			button.getElement().setAttribute("style",
					"margin:auto;width: 200px;display:block");
			round.add(button);
			headerBackButton.removeFromParent();
		}

		scrollPanel.setWidget(round);
		scrollPanel.setScrollingEnabledX(false);

	}

	@Override
	public HasTapHandlers getBackbutton() {
		if (MGWT.getOsDetection().isPhone()) {
			return button;
		}
		return super.getBackbutton();
	}

}