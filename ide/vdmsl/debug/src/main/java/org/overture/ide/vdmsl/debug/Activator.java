package org.overture.ide.vdmsl.debug;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugException;
import org.osgi.framework.BundleContext;


public class Activator extends Plugin
{

	// The plug-in ID
	public static final String PLUGIN_ID = IVdmSlDebugConstants.PLUGIN_ID;//"org.overturetool.core";

	public static final boolean DEBUG = true;
	public static final int INTERNAL_ERROR = 120;
	
	
	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static void log(Throwable t) {
		Throwable top = t;
		if (t instanceof DebugException) {
			Throwable throwable = ((DebugException) t).getStatus()
					.getException();
			if (throwable != null) {
				top = throwable;
			}
		}
		log(new Status(IStatus.ERROR, PLUGIN_ID, INTERNAL_ERROR,
				"internalErrorLoggedFromVdmPpDebugPlugin" + top.getMessage(), top));
	}

	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}
	
	public static void logWarning(String message) {
		logWarning(message, null);
	}

	public static void logWarning(String message, Throwable t) {
		log(new Status(IStatus.WARNING, PLUGIN_ID, INTERNAL_ERROR, message, t));
	}

	public static void logError(String message) {
		logError(message, null);
	}

	public static void logError(String message, Throwable t) {
		Throwable top = t;
		if (t instanceof DebugException) {
			Throwable throwable = ((DebugException) t).getStatus()
					.getException();
			if (throwable != null) {
				top = throwable;
			}
		}
		log(new Status(IStatus.ERROR, PLUGIN_ID, INTERNAL_ERROR, message, top));
	}
	
	@SuppressWarnings("unused")
	private final ListenerList shutdownListeners = new ListenerList();

}
