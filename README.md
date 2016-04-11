#Fragment callbacks in different scenarios 

	When fragment added in backstack - 
		04-11 11:31:50.288: D/FRAGMENT BACK STACK for A(20094):  onAttach()
		04-11 11:31:50.288: D/FRAGMENT BACK STACK for A(20094):  onCreate()
		04-11 11:31:50.289: D/FRAGMENT BACK STACK for A(20094):  onCreateView() creating new view
		04-11 11:31:50.307: D/FRAGMENT BACK STACK for A(20094):  onActivityCreated()
		04-11 11:31:50.308: D/FRAGMENT BACK STACK for A(20094):  onStart()
		04-11 11:31:50.308: D/FRAGMENT BACK STACK for A(20094):  onResume()

	Fragment Resuming fragment Backstack
		04-11 11:29:53.245: D/FRAGMENT BACK STACK for E(18541):  onCreateView() creating new view
		04-11 11:29:53.253: D/FRAGMENT BACK STACK for E(18541):  onActivityCreated()
		04-11 11:29:53.253: D/FRAGMENT BACK STACK for E(18541):  onStart()
		04-11 11:29:53.253: D/FRAGMENT BACK STACK for E(18541):  onResume()

	When user returns in application from app history.
		04-11 11:42:06.271: D/FRAGMENT BACK STACK for B(20094):  onStart()
		04-11 11:42:06.272: D/FRAGMENT BACK STACK for B(20094):  onResume()



#BackPress

		After poped fragment from BackStack
			04-11 11:32:48.715: D/FRAGMENT BACK STACK for A(20094):  onPause()
			04-11 11:32:48.715: D/FRAGMENT BACK STACK for A(20094):  onStop()
			04-11 11:32:48.717: D/FRAGMENT BACK STACK for A(20094):  onDestroyView()
			04-11 11:32:48.718: D/FRAGMENT BACK STACK for A(20094):  onDestroy()
			04-11 11:32:48.718: D/FRAGMENT BACK STACK for A(20094):  onDetach()
		
		When current fragment goes into background 
			04-11 11:29:53.245: D/FRAGMENT BACK STACK for A(18541):  onPause()
			04-11 11:29:53.245: D/FRAGMENT BACK STACK for A(18541):  onStop()
			04-11 11:29:53.245: D/FRAGMENT BACK STACK for A(18541):  onDestroyView()

		When user press power/home button
			04-11 11:29:53.245: D/FRAGMENT BACK STACK for A(18541):  onPause()
			04-11 11:29:53.245: D/FRAGMENT BACK STACK for A(18541):  onStop()
