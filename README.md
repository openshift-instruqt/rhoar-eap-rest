Simple HTTP server
==================

This repository contains a sample implementation of a JAX-RS application designed for use with JBoss EAP.

Using a Builder Image with OpenShift
------------------------------------

To create the application and deploy it from the command line when using OpenShift, run:

```
oc new-app jboss-eap71-openshift:1.0-TP~<source-files> --name <application-name>
oc expose svc/<application-name>
```

Replace ``<source-files>`` with a URL to your fork of this repository. Replace ``<application-name>`` with the name you wish to use for the application created.

In order to be able to use the S2I builder from the catalog available in the web console, you will need to instead run (as admin user):

```
oc replace -n openshift -f https://raw.githubusercontent.com/jboss-openshift/application-templates/master/jboss-image-streams.json
```
