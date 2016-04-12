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



#FragmentState Pager Adapter

First time
04-12 05:39:44.605: D/FragmentForPager  1:  onAttach()
04-12 05:39:44.605: D/FragmentForPager  1:  onCreate()
04-12 05:39:44.607: D/FragmentForPager  1:  onCreateView() creating new view
04-12 05:39:44.614: D/FragmentForPager  1:  onActivityCreated()
04-12 05:39:44.614: D/FragmentForPager  1:  onStart()
04-12 05:39:44.614: D/FragmentForPager  1:  onResume()
04-12 05:39:44.614: D/FragmentForPager  2:  onAttach()
04-12 05:39:44.614: D/FragmentForPager  2:  onCreate()
04-12 05:39:44.614: D/FragmentForPager  2:  onCreateView() creating new view
04-12 05:39:44.617: D/FragmentForPager  2:  onActivityCreated()
04-12 05:39:44.617: D/FragmentForPager  2:  onStart()
04-12 05:39:44.617: D/FragmentForPager  2:  onResume()


 After first slide
04-12 05:40:26.773: D/FragmentForPager  3:  onAttach()
04-12 05:40:26.774: D/FragmentForPager  3:  onCreate()
04-12 05:40:26.774: D/FragmentForPager  3:  onCreateView() creating new view
04-12 05:40:26.779: D/FragmentForPager  3:  onActivityCreated()
04-12 05:40:26.779: D/FragmentForPager  3:  onStart()
04-12 05:40:26.779: D/FragmentForPager  3:  onResume()


2nd slide
04-12 05:41:05.794: D/FragmentForPager  1:  onPause()
04-12 05:41:05.794: D/FragmentForPager  1:  onStop()
04-12 05:41:05.795: D/FragmentForPager  1:  onDestroyView()
04-12 05:41:05.797: D/FragmentForPager  1:  onDestroy()
04-12 05:41:05.797: D/FragmentForPager  1:  onDetach()

04-12 05:41:05.797: D/FragmentForPager  4:  onAttach()
04-12 05:41:05.797: D/FragmentForPager  4:  onCreate()
04-12 05:41:05.798: D/FragmentForPager  4:  onCreateView() creating new view
04-12 05:41:05.803: D/FragmentForPager  4:  onActivityCreated()
04-12 05:41:05.803: D/FragmentForPager  4:  onStart()
04-12 05:41:05.803: D/FragmentForPager  4:  onResume()

