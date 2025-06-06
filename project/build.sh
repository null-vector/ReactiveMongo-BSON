#!/usr/bin/env bash
  
set -e

DIR=`dirname $0 | sed -e "s|^./|$PWD/|"`

cd "$DIR/.."

SBT_CMDS="+clean +makePom +packageBin +packageSrc"

sbt $SBT_OPTS $SBT_CMDS

REACTIVEMONGO_SHADED=false sbt $SBT_OPTS $SBT_CMDS
